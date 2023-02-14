package starter.uielementdefinitions;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ClickElements {

   public static Target AcceptCookiesClick = Target.the("Aceptar Click").
           located(By.id("com.booking:id/bt_accept"));

   public static Target EmailClick = Target.the("Email Click").
           located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView"));

   public static Target ContinueClick = Target.the("Email Click").
           located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout"));


   public static Target SignInClick = Target.the("Sign In Click").
           located(By.id("com.booking:id/identity_landing_social_button_text"));

   public static Target StartSearchingClick = Target.the("Start searching").
           located(By.id("com.booking:id/genius_onbaording_bottomsheet_cta"));

   public static Target MenuSearchClick = Target.the("Menu Search Click").
           located(By.xpath("//android.widget.FrameLayout[@content-desc=\"Search\"]/android.widget.ImageView"));

   public static Target DestinationClick = Target.the("Destination Click").
           located(By.id("com.booking:id/facet_search_box_accommodation_destination"));

   public static Target FirstDestinationChoice = Target.the("First Destination Choice Click").
           located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));

   public static Target FromClick = Target.the("From Click").
           located(AppiumBy.accessibilityId("18 February 2023"));

   public static Target ToClick = Target.the("To Click").
           located(AppiumBy.accessibilityId("28 February 2023"));

   public static Target SelectDatesClick = Target.the("Select Dates Click").
           located(By.id("com.booking:id/facet_date_picker_confirm"));

   public static Target QuantityGuessClick = Target.the("Quantity Guess Click").
           located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView"));

   public static Target RoomClick = Target.the("Room Click").
           located(By.id("com.booking:id/facet_search_box_basic_field_label"));

   public static Target AddChildrenClick = Target.the("Children Click").
           located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.Button[2]"));

   public static Target ChildrenAgeClick = Target.the("Children Age Click").
           located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.NumberPicker/android.widget.Button[2]"));

   public static Target OkClick = Target.the("Add Click").
           located(By.id("android:id/button1"));

   public static Target ApplyClick = Target.the("Apply Click").
           located(By.id("com.booking:id/group_config_apply_button"));

   public static Target SearchButtonClick = Target.the("Search Button Click").
           located(By.id("com.booking:id/facet_search_box_cta"));

   public static Target SortButtonClick = Target.the("Sort Button Click").
           located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView"));


   public static Target StarsButtonClick = Target.the("Star Button Click").
           located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.CheckedTextView[2]"));

   public static Target FilterButtonClick = Target.the("Filter Button Click").
           located(By.xpath("\t\n" +
                   "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView"));

   public static Target FilterByAmountButtonClick = Target.the("Filter By Amount Button Click").
           located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.TextView"));

   public static Target ShowResultButtonClick = Target.the("Show Result Button Click").
           located(By.id("com.booking:id/apply_button"));
   public static Target hotelSecondChoiceClick = Target.the("Hotel Second Choice").
           located(By.xpath("\t\n" +
                   "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]"));

   public static Target selectRoomClick = Target.the("Select Room").
           located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.view.ViewGroup"));

   public static Target reserveTheseOptionClick = Target.the("Select Room").
           located(By.id("com.booking:id/recommended_block_reserve_button"));

}


