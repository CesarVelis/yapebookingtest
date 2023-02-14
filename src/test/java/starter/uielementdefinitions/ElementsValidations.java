package starter.uielementdefinitions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.screenplay.targets.Target;

public class ElementsValidations {
    public static Target firstPageHeaderElement = Target.
            the("Sign in or create an account").
            located(By.id("com.booking:id/identity_header_title"));

    public static Target firstPageHeaderDescriptionElement = Target.
            the("Choose any of the options below to sign in or start creating an account.").
            located(By.id("com.booking:id/identity_header_description"));

    public static Target firstPageSingInWithEmailElement = Target.
            the("Sign in with email").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView"));

    public static Target firstPageSingInWithGoogleElement = Target.
            the("Sign in with Google").located
                    (By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.Button[1]"));

    public static Target firstPageSingInWithFacebookElement = Target.
            the("Sign in with Facebook").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.Button[2]"));

    public static Target firstPageCreateAccountElement = Target.
            the("Create your account").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView"));

    public static Target firstPageTermAndConditionsElement = Target.
            the("By signing in or creating an account, you agree with our Terms & Conditions and Privacy Statement").
            located(By.id("com.booking:id/identity_terms_conditions"));

    public static Target welcomeElement = Target.
            the("Welcome to Booking.com!").
            located(By.id("com.booking:id/genius_onbaording_bottomsheet_title"));
    public static Target messageElement = Target.
            the("You can now enjoy your Genius Level 1 discounts worldwide, easily access your bookings, and more.").
            located(By.id("com.booking:id/genius_onbaording_bottomsheet_message"));

    public static Target geniusElement = Target.
            the("Learn more about Genius").
            located(By.id("com.booking:id/genius_onbaording_bottomsheet_secondary_cta"));

    public static Target startSearchingElement = Target.
            the("Start searching").
            located(By.id("com.booking:id/genius_onbaording_bottomsheet_cta"));

    public static Target addChildrenAgeElement = Target.
            the("Add Children Button").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.Button[2]"));

    public static Target childrenAgeElement = Target.
            the("Children Age Selector").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.NumberPicker/android.widget.Button[2]"));

    public static Target okButtonElement = Target.
            the("Ok button").
            located(By.id("android:id/button1"));

    public static Target applyButtonElement = Target.
            the("Apply Button").
            located(By.id("com.booking:id/group_config_apply_button"));

    public static Target emailProfileScreen = Target.
            the("testyape@gmail.com").
            located(By.id("com.booking:id/facet_profile_header_name"));
    public static Target levelProfileScreen = Target.
            the("Genius Level 1").
            located(By.id("com.booking:id/facet_profile_header_level"));

    public static Target messageLoyaltiProfileScreen = Target.
            the("Booking.com's loyalty program").
            located(By.id("com.booking:id/genius_signature_view_company"));

    public static Target manageAccount = Target.
            the("Manage your account").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView"));

    public static Target rewardswallet = Target.
            the("Rewards & Wallet").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView"));

    public static Target giftCards = Target.
            the("Rewards & Wallet").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView"));

    public static Target cacheSearchElement = Target.
            the("Rewards & Wallet").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup"));

    public static Target selectedHotelOptionElement = Target.
            the("JW Marriott El Convento Cusco").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));

    public static Target searchResultAmountElement = Target.
            the("Search Result Amount Result Page").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[5]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]"));

    public static Target selectedHotelOptionDescriptionElement = Target.
            the("JW Marriott El Convento Cusco").
            located(By.id("com.booking:id/property_name"));

    public static Target selectedHotelAmountElement = Target.
            the("Search Result Amount into hotel page selection").
            located(By.id("com.booking:id/price_view_price"));

    public static Target selectedRoomOptionDescriptionElement = Target.
            the("Inca Wall Room, Guest room, 2 Double, No view").
            located(By.id("com.booking:id/recommended_block_item_title"));

    public static Target selectedFinalAmountElement = Target.
            the("Total Price in Reserve These Options Page").
            located(By.id("com.booking:id/recommended_block_subtotal_price_view"));


    public static Target travelMoreSpendLessElement = Target.
            the("Travel more, spend less").
            located(By.id("com.booking:id/bui_title_title"));

    public static Target searchDiscountMessageElement = Target.
            the("Enjoy discounts at participating properties worldwide").
            located(By.id("com.booking:id/view_benefits_carousel_item_subtitle"));




}
