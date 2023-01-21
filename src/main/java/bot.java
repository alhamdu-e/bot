import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class bot  extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
        String command = update.getMessage().getText();
        if (command.equals("/run")) {
            String message = "run ";
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);
            try {
                execute(response);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
    }
        @Override
        public String getBotUsername () {
            // TODO
            return "alhamdu7624bo";
        }

        @Override
        public String getBotToken () {
            // TODO
            return "5818741376:AAFWnOWsv3kkh6m3DWhvX74kD_DDUXF_rWg";
        }
    }
