public enum HTTPError {
    ERROR400, ERROR401, ERROR402, ERROR403, ERROR404, ERROR405, ERROR406;

    public String errorName(){
        String errorName;
        switch (this){
            case ERROR400:
                errorName = "Bad Request";
                break;
            case ERROR401:
                errorName = "Unauthorized";
                break;
            case ERROR402:
                errorName = "Payment Required";
                break;
            case ERROR403:
                errorName = "Forbidden";
                break;
            case ERROR404:
                errorName = "Not Found";
                break;
            case ERROR405:
                errorName = "Method Not Allowed";
                break;
            case ERROR406:
                errorName = "Not Acceptable";
                break;
            default:
                errorName = "There is not error with this number";
                break;
        }
        return errorName;
    }
}
