package starter.uielementdefinitions;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class InputElements {
    public static Target email = Target.the("email value").
            located(AppiumBy.id("com.booking:id/identity_text_input_edit_text")
            );
    public static Target password = Target.the("password value").
            located(AppiumBy.id("com.booking:id/identity_text_input_edit_text")
            );

    public static Target destination = Target.the("Destination").
            located(AppiumBy.id("com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content")
            );

    public static Target childYearOld = Target.the("Child Year Old").
            located(AppiumBy.accessibilityId("5 years old")
            );
    public static Target ToDate = Target.the("To Date").
            located(AppiumBy.accessibilityId("14 February 2023")
            );


}
