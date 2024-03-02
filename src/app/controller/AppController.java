package app.controller;

import app.model.AppModel;
import app.view.AppView;

public class AppController {

    private final AppView view = new AppView();
    private final AppModel model = new AppModel();

    public void runApp(){
        view.getOutput(handleData());
    }

    public String handleData(){
        String selectedAction = view.selectAction();
        switch (selectedAction){
            case "1" -> {
                return model.getAllUser();
            }
            case "2" -> {
                try{
                    int lastUserIndex = model.getLastUserIndex();
                    int index = Integer.parseInt(view.getIndex(lastUserIndex));
                    return model.getUserByIndex(index);
                }catch (NumberFormatException e){
                    return "You have entered invalid data!";
                }catch (IndexOutOfBoundsException e){
                    return "Your index is out of range!";
                }catch (Exception e){
                    return "Something went wrong: " + e.getMessage();
                }
            }
            default -> {
                return "You have chosen a non-existent option!";
            }
        }
    }

}
