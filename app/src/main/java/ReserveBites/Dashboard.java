package ReserveBites;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplicationtechknowsball.R;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.dashboardScroll), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Profile header icon -> opens activity_mainfeature.xml
        ImageView imgProfile = findViewById(R.id.imgHeaderProfile);
        if (imgProfile != null) {
            imgProfile.setOnClickListener(v -> navigateToProfile());
        }

        // Quick Actions -> open activity_mainfeature3.xml
        LinearLayout actionMakeReservations = findViewById(R.id.actionMakeReservations);
        LinearLayout actionBrowseRestaurants = findViewById(R.id.actionBrowseRestaurants);
        LinearLayout actionMyFavorites = findViewById(R.id.actionMyFavorites);

        if (actionMakeReservations != null) {
            actionMakeReservations.setOnClickListener(v -> navigateToMainFeature3());
        }

        if (actionBrowseRestaurants != null) {
            actionBrowseRestaurants.setOnClickListener(v -> navigateToMainFeature3());
        }

        if (actionMyFavorites != null) {
            actionMyFavorites.setOnClickListener(v -> navigateToMainFeature3());
        }

        // Bottom Navigation Bar
        LinearLayout navDashboard = findViewById(R.id.navDashboard);
        LinearLayout navExplore = findViewById(R.id.navExplore);
        LinearLayout navReservations = findViewById(R.id.navReservations);
        LinearLayout navFavorites = findViewById(R.id.navFavorites);
        LinearLayout navProfile = findViewById(R.id.navProfile);

        if (navDashboard != null) {
            navDashboard.setOnClickListener(v ->
                Toast.makeText(Dashboard.this, "Already on Dashboard", Toast.LENGTH_SHORT).show()
            );
        }

        if (navExplore != null) {
            navExplore.setOnClickListener(v -> navigateToMainFeature3());
        }

        if (navReservations != null) {
            navReservations.setOnClickListener(v -> navigateToMainFeature3());
        }

        if (navFavorites != null) {
            navFavorites.setOnClickListener(v -> navigateToMainFeature3());
        }

        if (navProfile != null) {
            navProfile.setOnClickListener(v -> navigateToProfile());
        }
    }

    private void navigateToMainFeature3() {
        Intent intent = new Intent(Dashboard.this, FavoritesActivity.class);
        startActivity(intent);
    }

    private void navigateToProfile() {
        Intent intent = new Intent(Dashboard.this, Mainfeature.class);
        startActivity(intent);
    }
}
