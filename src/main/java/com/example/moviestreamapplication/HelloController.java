package com.example.moviestreamapplication;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button amv1_btn;

    @FXML
    private Button amv2_btn;

    @FXML
    private Button amv3_btn;

    @FXML
    private Button amv4_btn;

    @FXML
    private Button amv5_btn;

    @FXML
    private Button amv6_btn;

    @FXML
    private Button amv7_btn;

    @FXML
    private Button amv8_btn;

    @FXML
    private Button atitle1_btn;

    @FXML
    private Button atitle2_btn;

    @FXML
    private Button atitle3_btn;

    @FXML
    private Button atitle4_btn;

    @FXML
    private Button atitle5_btn;

    @FXML
    private Button atitle6_btn;

    @FXML
    private Button atitle7_btn;

    @FXML
    private Button atitle8_btn;

    @FXML
    private Button cmv1_btn;

    @FXML
    private Button cmv2_btn;

    @FXML
    private Button cmv3_btn;

    @FXML
    private Button cmv4_btn;

    @FXML
    private Button cmv5_btn;

    @FXML
    private Button cmv6_btn;

    @FXML
    private Button cmv7_btn;

    @FXML
    private Button cmv8_btn;

    @FXML
    private Button ctitle1_btn;

    @FXML
    private Button ctitle2_btn;

    @FXML
    private Button ctitle3_btn;

    @FXML
    private Button ctitle4_btn;

    @FXML
    private Button ctitle5_btn;

    @FXML
    private Button ctitle6_btn;

    @FXML
    private Button ctitle7_btn;

    @FXML
    private Button ctitle8_btn;

    @FXML
    private Button mv1_btn;

    @FXML
    private Button mv2_btn;

    @FXML
    private Button mv3_btn;

    @FXML
    private Button mv4_btn;

    @FXML
    private Button mv5_btn;

    @FXML
    private Button mv6_btn;

    @FXML
    private Button mv7_btn;

    @FXML
    private Button mv8_btn;


    @FXML
    private Button title1_btn;

    @FXML
    private Button title2_btn;

    @FXML
    private Button title3_btn;

    @FXML
    private Button title4_btn;

    @FXML
    private Button title5_btn;

    @FXML
    private Button title6_btn;

    @FXML
    private Button title7_btn;

    @FXML
    private Button title8_btn;

    Hyperlink img1trailer = new Hyperlink("https://www.youtube.com/embed/chQdpGz10h0");



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        img1trailer.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void  handle(MouseEvent mouseEvent){
            }
        });
        mv1_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/SfZWFDs0LxA");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        title1_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/SfZWFDs0LxA");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        mv2_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/b1WHQTbJ7vE");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        title2_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/b1WHQTbJ7vE");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        mv3_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/5eivkIIWjXY");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        title3_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/5eivkIIWjXY");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        mv4_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/Q-kivZVeJaE");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        title4_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/Q-kivZVeJaE");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        mv5_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/2CV6QKsyzWw");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        title5_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/2CV6QKsyzWw");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        mv6_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/tnr9frEhy7E");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        title6_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/tnr9frEhy7E");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        mv7_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/hWCorcoVDAE");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        title7_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/hWCorcoVDAE");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        mv8_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/KeScwnTZbaY");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        title8_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/KeScwnTZbaY");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        cmv1_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/afJXk-RgzoQ");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        ctitle1_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/afJXk-RgzoQ");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        cmv2_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/puR28wyxng4");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        ctitle2_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/puR28wyxng4");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        cmv3_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/5mJ77BIlWmc");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        ctitle3_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/5mJ77BIlWmc");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        cmv4_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/wxN1T1uxQ2g");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        ctitle4_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/wxN1T1uxQ2g");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        cmv5_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/3-xXh8xQt6o");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        ctitle5_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/3-xXh8xQt6o");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        cmv6_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/kDA45d7FYS4");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        ctitle6_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/kDA45d7FYS4");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        cmv7_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/FP81l1sEiDc");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        ctitle7_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/FP81l1sEiDc");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        cmv8_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/uWYLyNteYXk");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        ctitle8_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/uWYLyNteYXk");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        amv1_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/UmDxTrJa3XA");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        atitle1_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/UmDxTrJa3XA");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        amv2_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/oQMc7Sq36mI");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        atitle2_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/oQMc7Sq36mI");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        amv3_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/DRdcKz45oZI");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        atitle3_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/DRdcKz45oZI");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        amv4_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/RGswxYjN6lY");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        atitle4_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/RGswxYjN6lY");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        amv5_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/X0tOpBuYasI");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        atitle5_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/X0tOpBuYasI");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        amv6_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/2m1drlOZSDw");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        atitle6_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/2m1drlOZSDw");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });

        amv7_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/BfsNfFoA0J0");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        atitle7_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/BfsNfFoA0J0");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        amv8_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/sFTD5vBfRGY");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });
        atitle8_btn.setOnMouseClicked(e ->{ WebView webView = new WebView(); webView.getEngine().load("https://www.youtube.com/embed/sFTD5vBfRGY");
            javafx.scene.Scene scene = new javafx.scene.Scene(webView, 700, 500); Stage stage = new Stage();
            stage.setScene(scene); stage.show();
            System.out.println("Directing to web"); System.out.println("Streaming App");
        });




    }
}