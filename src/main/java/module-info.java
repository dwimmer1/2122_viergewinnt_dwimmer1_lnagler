module com.example.viergewinnt_dwimmer1_lnagler1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.viergewinnt_dwimmer1_lnagler1 to javafx.fxml;
    exports com.example.viergewinnt_dwimmer1_lnagler1.view;
    opens com.example.viergewinnt_dwimmer1_lnagler1.view to javafx.fxml;
    exports com.example.viergewinnt_dwimmer1_lnagler1.modell;
    opens com.example.viergewinnt_dwimmer1_lnagler1.modell to javafx.fxml;
    exports com.example.viergewinnt_dwimmer1_lnagler1.controller;
    opens com.example.viergewinnt_dwimmer1_lnagler1.controller to javafx.fxml;
}