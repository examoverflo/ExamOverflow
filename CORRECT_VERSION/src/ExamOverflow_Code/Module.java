package ExamOverflow_Code;

/**
 * Created by t00153953 on 07/12/2015.
 */
public enum Module {


    OOP3, WEBDESIGN, SOFTWARE_TESTING, DATABASE_DESIGN, NETWORK_FUNDAMENTALS, ROUTING_FUNDAMENTALS, OOP4;

    public String toString() {
        switch (this) {
            case OOP3:
                return " OOP3";
            case WEBDESIGN:
                return "Web Design";
            case SOFTWARE_TESTING:
                return "Software Testing";
            case DATABASE_DESIGN:
                return "Database Design";
            case NETWORK_FUNDAMENTALS:
                return "Network FundamentalsL";
            case ROUTING_FUNDAMENTALS:
                return "Routing Fundamentals";
            case OOP4:
                return "OOP4";
            default:
                return "Unspecified";
        }
    }
}
