function start(stage) {
    stage.title = "Scripting JavaFX";
    var button = new javafx.scene.control.Button();
    button.text = "Click Me!";
    button.onAction = function() {
    	print("Thank you!");
    }
    var root = new javafx.scene.layout.StackPane();
    root.children.add(button);
    stage.scene = new javafx.scene.Scene(root, 400, 200);
    stage.show();
}