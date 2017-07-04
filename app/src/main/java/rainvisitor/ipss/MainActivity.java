package rainvisitor.ipss;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView_Work_order_number)
    TextView textViewWorkOrderNumber;
    @BindView(R.id.switch_Vibration_sensor)
    Switch switchVibrationSensor;
    @BindView(R.id.textView_Equipment_efficiency)
    TextView textViewEquipmentEfficiency;
    @BindView(R.id.textView_integrated_productivity)
    TextView textViewIntegratedProductivity;
    @BindView(R.id.textView_Load_time_rate)
    TextView textViewLoadTimeRate;
    @BindView(R.id.textView_movement_rate)
    TextView textViewMovementRate;
    @BindView(R.id.textView_productivity_efficiency)
    TextView textViewProductivityEfficiency;
    @BindView(R.id.textView_yield)
    TextView textViewYield;
    @BindView(R.id.layout_product)
    LinearLayout layoutProduct;
    @BindView(R.id.textView_Testing_machine)
    TextView textViewTestingMachine;
    @BindView(R.id.textView_Voltage)
    TextView textViewVoltage;
    @BindView(R.id.textView_Current)
    TextView textViewCurrent;
    @BindView(R.id.textView_power)
    TextView textViewPower;
    @BindView(R.id.layout_processing_machine)
    LinearLayout layoutProcessingMachine;
    @BindView(R.id.textView_Baking_machine)
    TextView textViewBakingMachine;
    @BindView(R.id.textView_Processing_machine)
    TextView textViewProcessingMachine;
    @BindView(R.id.textView_Plan_production)
    TextView textViewPlanProduction;
    @BindView(R.id.textView_Amount_completed)
    TextView textViewAmountCompleted;
    @BindView(R.id.textView_Unfinished_quantity)
    TextView textViewUnfinishedQuantity;
    @BindView(R.id.textView_Remove_the_quantity)
    TextView textViewRemoveTheQuantity;
    @BindView(R.id.textView_tittle)
    TextView textViewTittle;
    @BindView(R.id.textView_temperature)
    TextView textViewTemperature;
    @BindView(R.id.textView_humidity)
    TextView textViewHumidity;
    @BindView(R.id.layout_baking_machine)
    LinearLayout layoutBakingMachine;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.layout_Testing_machine)
    LinearLayout layoutTestingMachine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setEffectivenessAnalysis(2.555, 0.0, 0.0, 0.0, 0.0, 0.0);
        setProcessingMachine(5.4,30.2,4.1);
        setBakingMachine(4.4,30.5);
        setProductAmount(5,4,3,2);
    }

    @OnClick(R.id.switch_Vibration_sensor)
    public void onViewClicked() {
    }

    private void setEffectivenessAnalysis(Double EquipmentEfficiency, Double IntegratedProductivity, Double LoadTimeRate, Double movementRate, Double ProductivityEfficiency, Double Yield) {
        if (EquipmentEfficiency != null) {
            String string = getString(R.string.equipment_efficiency) + " " + String.format(Locale.TAIWAN, "%.2f", EquipmentEfficiency) + "%";
            textViewEquipmentEfficiency.setText(string);
        }
        if (IntegratedProductivity != null) {
            String string = getString(R.string.integrated_productivity) + " " + String.format(Locale.TAIWAN, "%.2f", IntegratedProductivity) + "%";
            textViewIntegratedProductivity.setText(string);
        }
        if (LoadTimeRate != null) {
            String string = getString(R.string.load_time_rate) + " " + String.format(Locale.TAIWAN, "%.2f", LoadTimeRate) + "%";
            textViewLoadTimeRate.setText(string);
        }
        if (movementRate != null) {
            String string = getString(R.string.movement_rate) + " " + String.format(Locale.TAIWAN, "%.2f", movementRate) + "%";
            textViewMovementRate.setText(string);
        }
        if (ProductivityEfficiency != null) {
            String string = getString(R.string.productivity_efficiency) + " " + String.format(Locale.TAIWAN, "%.2f", ProductivityEfficiency) + "%";
            textViewProductivityEfficiency.setText(string);
        }
        if (Yield != null) {
            String string = getString(R.string.yield) + " " + String.format(Locale.TAIWAN, "%.2f", Yield) + "%";
            textViewYield.setText(string);
        }
    }

    private void setProcessingMachine(Double Voltage, Double Current, Double Power) {
        if (Voltage != null) {
            String string = getString(R.string.voltage) + ":" + String.format(Locale.TAIWAN, "%.2f", Voltage) + "V";
            textViewVoltage.setText(string);
        }
        if (Current != null) {
            String string = getString(R.string.current) + ":" + String.format(Locale.TAIWAN, "%.2f", Current) + "A";
            textViewCurrent.setText(string);
        }
        if (Power != null) {
            String string = getString(R.string.power) + ":" + String.format(Locale.TAIWAN, "%.2f", Power) + "kW";
            textViewPower.setText(string);
        }
    }

    private void setBakingMachine(Double Temperature, Double Humidity) {
        if (Temperature != null) {
            String string = getString(R.string.temperature) + ":" + String.format(Locale.TAIWAN, "%.2f", Temperature) + "°C";
            textViewTemperature.setText(string);
        }
        if (Humidity != null) {
            String string = getString(R.string.humidity) + ":" + String.format(Locale.TAIWAN, "%.2f", Humidity) + "%";
            textViewHumidity.setText(string);
        }
    }

    private void setProductAmount(Integer PlanProduction, Integer AmountCompleted, Integer UnfinishedQuantity, Integer RemoveQuantity) {
        if (PlanProduction != null) {
            String string = getString(R.string.plan_production) + "\n" + PlanProduction;
            textViewPlanProduction.setText(string);
        }
        if (AmountCompleted != null) {
            String string = getString(R.string.amount_completed) + "\n" + AmountCompleted;
            textViewAmountCompleted.setText(string);
        }
        if (UnfinishedQuantity != null) {
            String string = getString(R.string.unfinished_quantity) + "\n" + UnfinishedQuantity;
            textViewUnfinishedQuantity.setText(string);
        }
        if (RemoveQuantity != null) {
            String string = getString(R.string.remove_quantity) + "\n" + RemoveQuantity;
            textViewRemoveTheQuantity.setText(string);
        }
    }
}
