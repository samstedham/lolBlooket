public class Blooket {
    public String getAnswers(String setId) {
        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = Unirest.get("https://api.blooket.com/api/games?gameId=" + setId).asString();
        return response;
    }

    public static void main (String[] args) {
        System.out.println(getAnswers("60760243e0a7d8001b7070c4"));
    }
}