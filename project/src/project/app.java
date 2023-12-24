package project;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class app extends Application {

    private TextArea chatArea;
    private TextField messageField;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple Chat App");

        // Setup UI components
        chatArea = new TextArea();
        chatArea.setEditable(false);

        messageField = new TextField();
        messageField.setPromptText("Type your message...");

        Button sendButton = new Button("Send");
        sendButton.setOnAction(e -> sendMessage());

        // Layout setup
        BorderPane layout = new BorderPane();
        layout.setCenter(chatArea);
        layout.setBottom(createMessageInputLayout());

        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void sendMessage() {
        String message = messageField.getText();
        if (!message.isEmpty()) {
            chatArea.appendText("You: " + message + "\n");
            messageField.clear();
        }
    }

    private BorderPane createMessageInputLayout() {
        BorderPane inputLayout = new BorderPane();
        inputLayout.setPadding(new Insets(10, 10, 10, 10));

        inputLayout.setCenter(messageField);
        inputLayout.setRight(new Label("  "));
        inputLayout.setBottom(createSendButtonLayout());

        return inputLayout;
    }

    private BorderPane createSendButtonLayout() {
        BorderPane sendButtonLayout = new BorderPane();
        Button sendButton = new Button("Send");
        sendButton.setOnAction(e -> sendMessage());

        sendButtonLayout.setRight(sendButton);

        return sendButtonLayout;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
