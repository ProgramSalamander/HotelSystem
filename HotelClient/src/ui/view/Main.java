package ui.view;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;
import ui.view.user.LoginController;
import ui.view.user.LoginOverviewController;
import ui.view.user.RegistController;

public class Main extends Application {
	private Stage stage;
	private final double MINIMUM_WINDOW_WIDTH = 400.0;
	private final double MINIMUM_WINDOW_HEIGHT = 250.0;

	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;
		stage.setTitle("Hotel");
		stage.setMinHeight(MINIMUM_WINDOW_HEIGHT);
		stage.setMinWidth(MINIMUM_WINDOW_WIDTH);
		stage.setResizable(false);
		initUI();
		stage.show();
	}
	
	//初始界面
	public void initUI(){
		try {
			LoginOverviewController loginOverviewController = (LoginOverviewController) replaceSceneContent("user/LoginOverview.fxml");
			loginOverviewController.setMain(this);
		} catch (Exception e) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
		}
	}
	
	//跳转到登录界面
	public void gotoLogin(){
		try {
			LoginController loginController = (LoginController) replaceSceneContent("user/Login.fxml");
			loginController.setMain(this);
		} catch (Exception e) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
		}
	}
	
	//跳转到注册界面
	public void gotoRegist(){
		try {
			RegistController registController = (RegistController)replaceSceneContent("user/Regist.fxml");
			registController.setMain(this);
		} catch (Exception e) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
		}
	}
	
	//界面跳转主要方法
	private Initializable replaceSceneContent(String fxml) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		InputStream inputStream = Main.class.getResourceAsStream(fxml);
		loader.setBuilderFactory(new JavaFXBuilderFactory());
		loader.setLocation(Main.class.getResource(fxml));
		AnchorPane pane;
		try {
			pane = (AnchorPane) loader.load(inputStream);
		} finally {
			inputStream.close();
		}
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.setResizable(false);
		return (Initializable) loader.getController();
	}

	public Stage getPrimaryStage(){
		return stage;
	}
	public static void main(String[] args) {
		launch(args);
	}

}
