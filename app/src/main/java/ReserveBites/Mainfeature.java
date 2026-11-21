package ReserveBites;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplicationtechknowsball.R;

public class Mainfeature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mainfeature);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Log Out buttons (button21 and button33) -> returns to Login (activity_login2.xml)
        Button btnLogout1 = findViewById(R.id.button21);
        Button btnLogout2 = findViewById(R.id.button33);

        if (btnLogout1 != null) {
            btnLogout1.setOnClickListener(v -> performLogout());
        }
        if (btnLogout2 != null) {
            btnLogout2.setOnClickListener(v -> performLogout());
        }

        // Bottom Navigation Bar in activity_mainfeature.xml
        Button btnNavDashboard = findViewById(R.id.button27);
        Button btnNavFavorites = findViewById(R.id.button24);
        Button btnNavProfile = findViewById(R.id.button23);

        // Dashboard button (button27) -> activity_dashboard.xml
        if (btnNavDashboard != null) {
            btnNavDashboard.setOnClickListener(v -> {
                Intent intent = new Intent(Mainfeature.this, Dashboard.class);
                startActivity(intent);
                finish();
            });
        }

        // Favorites button (button24) -> activity_mainfeature3.xml
        if (btnNavFavorites != null) {
            btnNavFavorites.setOnClickListener(v -> {
                Intent intent = new Intent(Mainfeature.this, FavoritesActivity.class);
                startActivity(intent);
                finish();
            });
        }

        // Profile button (button23)
        if (btnNavProfile != null) {
            btnNavProfile.setOnClickListener(v ->
                Toast.makeText(Mainfeature.this, "You are on Profile", Toast.LENGTH_SHORT).show()
            );
        }
    }

    private void performLogout() {
        Toast.makeText(this, "Logged out successfully", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Mainfeature.this, Login.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }
}
