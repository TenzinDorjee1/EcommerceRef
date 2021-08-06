module git_Ecommerce {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	requires java.desktop;
	requires java.rmi;
	requires java.sql;
	
	opens application to javafx.graphics, javafx.fxml;
	opens model to javafx.base;
}
