// FinBankApp.java
public class FinBankApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
            getClass().getResource("/fxml/dashboard.fxml")
        );
        Scene scene = new Scene(loader.load(), 1200, 750);
        scene.getStylesheets().add(
            getClass().getResource("/css/styles.css").toExternalForm()
        );

        primaryStage.setTitle("FinBank — Sistema de Gestión");
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(900);
        primaryStage.setMinHeight(600);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
