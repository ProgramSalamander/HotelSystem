package ui.view.user;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.BoxBlur;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.util.Duration;
import ui.view.Main;

public class LoginOverviewController implements Initializable {
	@FXML
	private Button clientButton;
	
	@FXML
	private Button hotelButton;
	
	@FXML
	private Button marketButton;
	
	@FXML
	private Button managerButton;
	
	@FXML
	private Label welcomeLabel;
	
	private Main main;
	
	@FXML
	public void gotoLogin(ActionEvent event){
		main.gotoLogin();
	}
	
	
	public LoginOverviewController(){
		
	}
	
	@FXML
	private void initialize(){
		
	}
	
	
	public void setMain(Main main){
		this.main = main;
		
	}


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO 自动生成的方法存根
		
	}
	
}
