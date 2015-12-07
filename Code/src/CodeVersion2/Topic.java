package CodeVersion2;

/**
 * Created by t00153953 on 07/12/2015.
 */
public enum Topic {

    JAVA,C,LOOPS,JAVASCRIPT,MYSQL,HTML,PHP,SQL;

    public String toString(){
        switch(this){
            case JAVA: return "Java";
            case C: return "C";
            case LOOPS: return "Loops";
            case JAVASCRIPT: return "Javascript";
            case MYSQL: return "MYSQL";
            case HTML: return "HTML";
            case PHP: return "PHP";
            case SQL: return "SQL";
            default: return "Unspecified";
        }

    }
}
