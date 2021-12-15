/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoewithminmaxalgortihm;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import static jdk.nashorn.internal.objects.Global.Infinity;

/**
 *
 * @author Anthony
 */
class Scores{
    int X=-10;
    int O=10;
    int Tie=0;
}
public class TicTacToeWithMinMaxAlgortihm extends Application {
    
    @Override
    public void start(Stage primaryStage){
        GridPane root = new GridPane();
        Button b=new Button();
        Button b2=new Button();
        Button b3=new Button();
        Button b4=new Button();
        Button b5=new Button();
        Button b6=new Button();
        Button b7=new Button();
        Button b8=new Button();
        Button b9=new Button();
        Scene scene = new Scene(root, 300, 250);
        b.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        b.setId("b1");
        b2.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        b2.setId("b2");
        b3.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        b3.setId("b3");
        b4.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        b4.setId("b4");
        b5.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        b5.setId("b5");
        b6.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        b6.setId("b6");
        b7.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        b7.setId("b7");
        b8.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        b8.setId("b8");
        b9.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        b9.setId("b9");
        root.setStyle("-fx-focus-color: transparent;");
        root.add(b, 0, 0);
        root.add(b2, 1, 0);
        root.add(b3, 2, 0);
        root.add(b4, 0, 1);
        root.add(b5, 1, 1);
        root.add(b6, 2, 1);
        root.add(b7, 0, 2);
        root.add(b8, 1, 2);
        root.add(b9, 2, 2);
        root.setGridLinesVisible(true);
        root.setId("g");
        b.setOnMouseClicked(e->{
    root.getChildren().remove(b);
    Label x1=new Label("X");
    x1.setId("x1");
    x1.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        x1.setAlignment(Pos.CENTER);
        x1.setFont(new Font("Arial", 70));
    root.add(x1, 0, 0);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
       AiTurn(root,scene); 
    }
        });
        b2.setOnMouseClicked(e->{
    root.getChildren().remove(b2);
    Label x2=new Label("X");
    x2.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
    x2.setId("x2");    
    x2.setAlignment(Pos.CENTER);
        x2.setFont(new Font("Arial", 70));
    root.add(x2, 1, 0);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
       AiTurn(root,scene); 
    }
    });
        b3.setOnMouseClicked(e->{
    root.getChildren().remove(b3);
    Label x3=new Label("X");
    x3.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        x3.setAlignment(Pos.CENTER);
        x3.setId("x3");
        x3.setFont(new Font("Arial", 70));
    root.add(x3, 2, 0);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
       AiTurn(root,scene); 
    }
    });
        b4.setOnMouseClicked(e->{
    root.getChildren().remove(b4);
    Label x4=new Label("X");
    x4.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        x4.setAlignment(Pos.CENTER);
        x4.setId("x4");
        x4.setFont(new Font("Arial", 70));
    root.add(x4, 0, 1);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
       AiTurn(root,scene); 
    }
    });
        b5.setOnMouseClicked(e->{
    root.getChildren().remove(b5);
    Label x5=new Label("X");
    x5.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        x5.setAlignment(Pos.CENTER);
      x5.setId("x5");
        x5.setFont(new Font("Arial", 70));
    root.add(x5, 1, 1);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
       AiTurn(root,scene); 
    }
    });
        b6.setOnMouseClicked(e->{
    root.getChildren().remove(b6);
    Label x6=new Label("X");
    x6.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
    x6.setId("x6");   
    x6.setAlignment(Pos.CENTER);
        x6.setFont(new Font("Arial", 70));
    root.add(x6, 2, 1);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
       AiTurn(root,scene); 
    }
    });
        b7.setOnMouseClicked(e->{
    root.getChildren().remove(b7);
    Label x7=new Label("X");
    x7.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        x7.setAlignment(Pos.CENTER);
        x7.setId("x7");
        x7.setFont(new Font("Arial", 70));
    root.add(x7, 0, 2);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
       AiTurn(root,scene); 
    }
    });
        b8.setOnMouseClicked(e->{
    root.getChildren().remove(b8);
    Label x8=new Label("X");
    x8.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        x8.setAlignment(Pos.CENTER);
        x8.setId("x8");
        x8.setFont(new Font("Arial", 70));
    root.add(x8, 1, 2);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
       AiTurn(root,scene); 
    }
    });
        b9.setOnMouseClicked(e->{
    root.getChildren().remove(b9);
    Label x9=new Label("X");
    x9.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        x9.setAlignment(Pos.CENTER);
        x9.setId("x9");
        x9.setFont(new Font("Arial", 70));
    root.add(x9, 2, 2);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
       AiTurn(root,scene); 
    }
    });
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    public void IsDraw(Node root){
        if(root.lookup("#b1")==null && root.lookup("#b2")==null && root.lookup("#b3")==null && root.lookup("#b4")==null && root.lookup("#b5")==null && root.lookup("#b6")==null && root.lookup("#b7")==null && root.lookup("#b8")==null && root.lookup("#b9")==null)
            if(IsWinner(root)==null){
            Alert a = new Alert(AlertType.INFORMATION);
                a.setTitle("Game Ended");
                a.setContentText("Draw!");
                a.setOnCloseRequest(e->{
                System.exit(0);
                });
                a.showAndWait();
            }
    }
    String IsWinner(Node root){
        Label x1=(Label) root.lookup("#x1");
        Label x2=(Label) root.lookup("#x2");
        Label x3=(Label) root.lookup("#x3");
        Label x4=(Label) root.lookup("#x4");
        Label x5=(Label) root.lookup("#x5");
        Label x6=(Label) root.lookup("#x6");
        Label x7=(Label) root.lookup("#x7");
        Label x8=(Label) root.lookup("#x8");
        Label x9=(Label) root.lookup("#x9");
        if(root.lookup("#x1")!=null && root.lookup("#x2")!=null && root.lookup("#x3")!=null){
            if(x1.getText()==x2.getText() && x2.getText()==x3.getText()){
                System.out.println("Winner Is "+x1.getText());
                Alert a = new Alert(AlertType.INFORMATION);
                a.setTitle("Game Ended");
                a.setContentText("Winner Is "+x1.getText());
                a.setOnCloseRequest(e->{
                System.exit(0);
                });
                a.showAndWait();
                return x1.getText();
            }
        }
        if(root.lookup("#x1")!=null && root.lookup("#x4")!=null && root.lookup("#x7")!=null){
            if(x1.getText()==x4.getText() && x4.getText()==x7.getText()){
                System.out.println("Winner Is "+x1.getText());
                Alert a = new Alert(AlertType.INFORMATION);
                a.setTitle("Game Ended");
                a.setContentText("Winner Is "+x1.getText());
                a.setOnCloseRequest(e->{
                System.exit(0);
                });
                a.showAndWait();
                return x1.getText();
            }
        }
        if(root.lookup("#x1")!=null && root.lookup("#x5")!=null && root.lookup("#x9")!=null){
            if(x1.getText()==x5.getText() && x5.getText()==x9.getText()){
                System.out.println("Winner Is "+x1.getText());
                Alert a = new Alert(AlertType.INFORMATION);
                a.setTitle("Game Ended");
                a.setContentText("Winner Is "+x1.getText());
                a.setOnCloseRequest(e->{
                System.exit(0);
                });
                a.showAndWait();
                return x1.getText();
            }
        }
        if(root.lookup("#x3")!=null && root.lookup("#x5")!=null && root.lookup("#x7")!=null){
            if(x3.getText()==x5.getText() && x5.getText()==x7.getText()){
                System.out.println("Winner Is "+x3.getText());
                Alert a = new Alert(AlertType.INFORMATION);
                a.setTitle("Game Ended");
                a.setContentText("Winner Is "+x3.getText());
                a.setOnCloseRequest(e->{
                System.exit(0);
                });
                a.showAndWait();
                return x3.getText();
            }
        }
        if(root.lookup("#x4")!=null && root.lookup("#x5")!=null && root.lookup("#x6")!=null){
            if(x4.getText()==x5.getText() && x5.getText()==x6.getText()){
                System.out.println("Winner Is "+x4.getText());
                Alert a = new Alert(AlertType.INFORMATION);
                a.setTitle("Game Ended");
                a.setContentText("Winner Is "+x4.getText());
                a.setOnCloseRequest(e->{
                System.exit(0);
                });
                a.showAndWait();
                return x4.getText();
            }
        }
        if(root.lookup("#x7")!=null && root.lookup("#x8")!=null && root.lookup("#x9")!=null){
            if(x7.getText()==x8.getText() && x8.getText()==x9.getText()){
                System.out.println("Winner Is "+x7.getText());
                Alert a = new Alert(AlertType.INFORMATION);
                a.setTitle("Game Ended");
                a.setContentText("Winner Is "+x7.getText());
                a.setOnCloseRequest(e->{
                System.exit(0);
                });
                a.showAndWait();
                return x7.getText();
            }
        }
        if(root.lookup("#x2")!=null && root.lookup("#x5")!=null && root.lookup("#x8")!=null){
            if(x2.getText()==x5.getText() && x5.getText()==x8.getText()){
                System.out.println("Winner Is "+x2.getText());
                Alert a = new Alert(AlertType.INFORMATION);
                a.setTitle("Game Ended");
                a.setContentText("Winner Is "+x2.getText());
                a.setOnCloseRequest(e->{
                System.exit(0);
                });
                a.showAndWait();
                return x2.getText();
            }
        }
        if(root.lookup("#x3")!=null && root.lookup("#x6")!=null && root.lookup("#x9")!=null){
            if(x3.getText()==x6.getText() && x6.getText()==x9.getText()){
                System.out.println("Winner Is "+x3.getText());
                Alert a = new Alert(AlertType.INFORMATION);
                a.setTitle("Game Ended");
                a.setContentText("Winner Is "+x3.getText());
                a.setOnCloseRequest(e->{
                System.exit(0);
                });
                a.showAndWait();
                return x3.getText();
            }
        }
        return null;
    }
    public void AiTurn(Node root,Scene scene){
        GridPane g=(GridPane) root.lookup("#g");
        String[][] BoardState=new String[3][3];
        int count=1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(root.lookup("#b"+count)==null){
                    Label txt=(Label) root.lookup("#x"+count);
                    if(txt.getText()=="X"){
                        BoardState[i][j]="X";
                    }
                    else{
                        BoardState[i][j]="O";
                    }
                }
                else{
                    BoardState[i][j]=" ";
                }
                    count++;
            }
        }
        int[] IdealMove=BestMove(BoardState,root);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==IdealMove[0] && j==IdealMove[1]){
        BoardState[i][j]="O";
                }
            System.out.print(BoardState[i][j]+" | ");
            }
            System.out.println();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(BoardState[i][j]=="O"){
                    if(i==0 && j==0){
                    g.getChildren().remove(root.lookup("#b1"));
                    Label x1=new Label("O");
                    x1.setId("x1");
                    x1.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
                        x1.setAlignment(Pos.CENTER);
                        x1.setFont(new Font("Arial", 70));
                    g.add(x1, 0, 0);
                    IsDraw(root);
                    IsWinner(root);  
                    }
                    if(i==0 && j==1){
                        g.getChildren().remove(root.lookup("#b2"));
                        Label x2=new Label("O");
                        x2.setId("x2");
                        x2.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
                            x2.setAlignment(Pos.CENTER);
                            x2.setFont(new Font("Arial", 70));
                        g.add(x2, 1, 0);
                        IsDraw(root);
                        IsWinner(root);
                    }
                    if(i==0 && j==2){
                        g.getChildren().remove(root.lookup("#b3"));
                        Label x3=new Label("O");
                        x3.setId("x3");
                        x3.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
                            x3.setAlignment(Pos.CENTER);
                            x3.setFont(new Font("Arial", 70));
                        g.add(x3, 2, 0);
                        IsDraw(root);
                        IsWinner(root);
                    }
                    if(i==1 && j==0){
                        g.getChildren().remove(root.lookup("#b4"));
                        Label x4=new Label("O");
                        x4.setId("x4");
                        x4.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
                            x4.setAlignment(Pos.CENTER);
                            x4.setFont(new Font("Arial", 70));
                        g.add(x4, 0, 1);
                        IsDraw(root);
                        IsWinner(root);
                    }
                    if(i==1 && j==1){
                        g.getChildren().remove(root.lookup("#b5"));
                        Label x5=new Label("O");
                        x5.setId("x5");
                        x5.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
                            x5.setAlignment(Pos.CENTER);
                            x5.setFont(new Font("Arial", 70));
                        g.add(x5, 1,1);
                        IsDraw(root);
                        IsWinner(root);
                    }
                    if(i==1 && j==2){
                    g.getChildren().remove(root.lookup("#b6"));
                    Label x6=new Label("O");
                    x6.setId("x6");
                    x6.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
                        x6.setAlignment(Pos.CENTER);
                        x6.setFont(new Font("Arial", 70));
                    g.add(x6, 2, 1);
                    IsDraw(root);
                    IsWinner(root);    
                    }
                    if(i==2 && j==0){
                    g.getChildren().remove(root.lookup("#b7"));
                    Label x7=new Label("O");
                    x7.setId("x7");
                    x7.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
                        x7.setAlignment(Pos.CENTER);
                        x7.setFont(new Font("Arial", 70));
                    g.add(x7, 0, 2);
                    IsDraw(root);
                    IsWinner(root);
                    }
                    if(i==2 && j==1){
                    g.getChildren().remove(root.lookup("#b8"));
                    Label x8=new Label("O");
                    x8.setId("x8");
                    x8.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
                        x8.setAlignment(Pos.CENTER);
                        x8.setFont(new Font("Arial", 70));
                    g.add(x8, 1, 2);
                    IsDraw(root);
                    IsWinner(root);
                    }
                    if(i==2 && j==2){
                    g.getChildren().remove(root.lookup("#b9"));
                    Label x9=new Label("O");
                    x9.setId("x9");
                    x9.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
                        x9.setAlignment(Pos.CENTER);
                        x9.setFont(new Font("Arial", 70));
                    g.add(x9, 2, 2);
                    IsDraw(root);
                    IsWinner(root);
                    }
                }
            }
        }
        /*if(x==1){
            if(root.lookup("#b")!=null){
            g.getChildren().remove(root.lookup("#b"));
    Label x1=new Label("O");
    x1.setId("x1");
    x1.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        x1.setAlignment(Pos.CENTER);
        x1.setFont(new Font("Arial", 70));
    g.add(x1, 0, 0);
    IsDraw(root);
    IsWinner(root);
        }
            else{
                AiTurn(root,scene);
            }
        }
        if(x==2){
            if(root.lookup("#b2")!=null){
                g.getChildren().remove(root.lookup("#b2"));
    Label x2=new Label("O");
    x2.setId("x2");
    x2.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        x2.setAlignment(Pos.CENTER);
        x2.setFont(new Font("Arial", 70));
    g.add(x2, 1, 0);
    IsDraw(root);
    IsWinner(root);
        }
            else{
                AiTurn(root,scene);
            }
        }
        if(x==3){
            if(root.lookup("#b3")!=null){
            g.getChildren().remove(root.lookup("#b3"));
    Label x3=new Label("O");
    x3.setId("x3");
    x3.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        x3.setAlignment(Pos.CENTER);
        x3.setFont(new Font("Arial", 70));
    g.add(x3, 2, 0);
    IsDraw(root);
    IsWinner(root);
        }
            else{
                AiTurn(root,scene);
            }
        }
        if(x==4){
            if(root.lookup("#b4")!=null){
            g.getChildren().remove(root.lookup("#b4"));
    Label x4=new Label("O");
    x4.setId("x4");
    x4.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        x4.setAlignment(Pos.CENTER);
        x4.setFont(new Font("Arial", 70));
    g.add(x4, 0, 1);
    IsDraw(root);
    IsWinner(root);
        }
            else{
                AiTurn(root,scene);
            }
        }
        if(x==5){
            if(root.lookup("#b5")!=null){
            g.getChildren().remove(root.lookup("#b5"));
    Label x5=new Label("O");
    x5.setId("x5");
    x5.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        x5.setAlignment(Pos.CENTER);
        x5.setFont(new Font("Arial", 70));
    g.add(x5, 1,1);
    IsDraw(root);
    IsWinner(root);
        }
            else{
                AiTurn(root,scene);
            }
        }
        if(x==6){
            if(root.lookup("#b6")!=null){
            g.getChildren().remove(root.lookup("#b6"));
    Label x6=new Label("O");
    x6.setId("x6");
    x6.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        x6.setAlignment(Pos.CENTER);
        x6.setFont(new Font("Arial", 70));
    g.add(x6, 2, 1);
    IsDraw(root);
    IsWinner(root);    
        }
            else{
                AiTurn(root,scene);
            }
        }
        if(x==7){
            if(root.lookup("#b7")!=null){
            g.getChildren().remove(root.lookup("#b7"));
    Label x7=new Label("O");
    x7.setId("x7");
    x7.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        x7.setAlignment(Pos.CENTER);
        x7.setFont(new Font("Arial", 70));
    g.add(x7, 0, 2);
    IsDraw(root);
    IsWinner(root);
        }
            else{
                AiTurn(root,scene);
            }
        }
        if(x==8){
            if(root.lookup("#b8")!=null){
            g.getChildren().remove(root.lookup("#b8"));
    Label x8=new Label("O");
    x8.setId("x8");
    x8.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        x8.setAlignment(Pos.CENTER);
        x8.setFont(new Font("Arial", 70));
    g.add(x8, 1, 2);
    IsDraw(root);
    IsWinner(root);
        }
            else{
                AiTurn(root,scene);
            }
        }
        if(x==9){
            if(root.lookup("#b9")!=null){
            g.getChildren().remove(root.lookup("#b9"));
    Label x9=new Label("O");
    x9.setId("x9");
    x9.setPrefSize(scene.getWidth()/3, scene.getHeight()/3);
        x9.setAlignment(Pos.CENTER);
        x9.setFont(new Font("Arial", 70));
    g.add(x9, 2, 2);
    IsDraw(root);
    IsWinner(root);
        }
            else{
                AiTurn(root,scene);
            }
        }*/
    }
    int[] BestMove(String[][] Board,Node root){
        int BestScore=(int)-Infinity;
        int[] Move=new int[2];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(" "==Board[i][j]){
                    Board[i][j]="O";
            int Score=MinMax(Board,root,false,0);
            Board[i][j]=" ";
            if(Score>BestScore){
                BestScore=Score;
                Move[0]=i;
                Move[1]=j;
            }
                }
            }
        }
        return Move;
    }
    int MinMax(String[][] Board,Node root,Boolean IsMaximizing,int depth){
        String result=checkWinner(Board);
        if(result!=null){
            Scores s=new Scores();
            switch (result) {
                case "X":
                    return s.X;
                case "O":
                    return s.O;
                case "tie":
                    return s.Tie;
            }
        }
        int bestScore;
        if(IsMaximizing){
            bestScore=(int)-Infinity;
            for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(Board[i][j]==" "){
                    Board[i][j]="O";
            int Score=MinMax(Board,root,false,depth+1);
            Board[i][j]=" ";
            bestScore=Integer.max(bestScore, Score);
                }
            }
            }
            return bestScore;
        }
        else{
            bestScore=(int)Infinity;
            for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(" "==Board[i][j]){
                    Board[i][j]="X";
            int Score=MinMax(Board,root,true,depth+1);
            Board[i][j]=" ";
            bestScore=Integer.min(bestScore, Score);
                }
            }
            }
            
    }
   return bestScore;
}
    String checkWinner(String[][] Board){
        String Winner="";
        for (int i = 0; i < 3; i++) {
    if(Board[i][0]==Board[i][1] && Board[i][1]==Board[i][2]) {
      Winner = Board[i][0];
    }
  }
        for (int j = 0; j < 3; j++) {
    if(Board[0][j]==Board[1][j] && Board[0][j]==Board[2][j]) {
      Winner = Board[0][j];
    }
  }
        if (Board[0][0]==Board[1][1] && Board[1][1]==Board[2][2]) {
    Winner = Board[0][0];
  }
  if (Board[2][0]==Board[1][1] && Board[1][1]==Board[0][2]) {
    Winner = Board[2][0];
  }
  int openSpots = 0;
  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
      if (Board[i][j]==" ") {
        openSpots++;
      }
    }
  }
        if(""==Winner && openSpots==0){
            return "tie";
        }
        else{
            return Winner;
        }
    }
}
