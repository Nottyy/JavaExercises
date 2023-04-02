package fairyShop.core;

import fairyShop.common.Command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EngineImpl implements Engine {
    private Controller controller;
    private BufferedReader reader;

    public EngineImpl() {
        this.controller = new ControllerImpl();
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void run() {

        while (true) {
            String result = null;

            try {
                result = ProcessInput();

                if (result.equals("Exit")) {
                    break;
                }
            } catch (NullPointerException | IllegalArgumentException | IOException e) {
                result = e.getMessage();
            }


            System.out.println(result);
        }
    }

    private String ProcessInput() throws IOException {
        String input = this.reader.readLine();
        String[] split = input.split(" ");
        String[] data = Arrays.copyOfRange(split, 1, split.length);
        Command command = Command.valueOf(split[0]);
        String result = null;

        switch (command) {
            case AddHelper:
                result = this.AddHelper(data);
                break;
            case AddPresent:
                result = this.AddPresent(data);
                break;
            case AddInstrumentToHelper:
                result = this.AddInstrumentToHelper(data);
                break;
            case CraftPresent:
                result = this.CraftPresent(data);
                break;
            case Report:
                result = this.controller.Report();
                break;
            case Exit:
                result = Command.Exit.name();
                break;
        }

        return result;
    }

    private String CraftPresent(String[] data) {
        return this.controller.CraftPresents(data[0]);
    }

    private String AddInstrumentToHelper(String[] data) {
        return this.controller.AddInstrumentToHelper(data[0], Integer.parseInt(data[1]));
    }

    private String AddPresent(String[] data) {
        return this.controller.AddPresent(data[0], Integer.parseInt(data[1]));
    }

    private String AddHelper(String[] data) {
        return this.controller.AddHelper(data[0], data[1]);
    }
}