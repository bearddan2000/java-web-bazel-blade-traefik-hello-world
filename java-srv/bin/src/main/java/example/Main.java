package example;

import com.blade.Blade;
import com.blade.event.EventType;
import com.blade.mvc.WebContext;
import com.blade.mvc.http.Session;

public class Main {

    public static void main(String[] args) {

        Blade.of()
            .get("/", ctx -> ctx.render("index.html"))
            .enableCors(true)
            .start(Main.class, args);
    }
}
