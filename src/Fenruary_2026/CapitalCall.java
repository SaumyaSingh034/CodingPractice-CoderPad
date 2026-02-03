package Fenruary_2026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CapitalCall {
    static class Trans{
        String type;
        double amount;

        Trans(String type, double amount){
            this.type = type;
            this.amount = amount;
        }
    }

    public static void main(String[] args){
        Map<String, Integer> transactions = new HashMap<>();
        transactions.put("CALL", 1000);
        transactions.put("DITRIBUTION", 400);
        transactions.put("CALL", 200);

        List<Trans> transcation = new ArrayList<>();
        transcation.add(new Trans("CALL", 1000));
        transcation.add(new Trans("DISTRIBUTION", 400));
        transcation.add(new Trans("CALL", 200));

        calculateNetAmount(transcation);
    }

    private static void calculateNetAmount(List<Trans> transcation) {
        double netAmount = 0;
        for(Trans t : transcation){
            switch(t.type.toUpperCase()){
                case "CALL":
                    netAmount += t.amount;
                    break;
                case "DISTRIBUTION":
                    netAmount -= t.amount;

                default:
                    throw new IllegalArgumentException(
                            "Invalid transaction type: " + t.type
                    );
            }
        }
    }
}
