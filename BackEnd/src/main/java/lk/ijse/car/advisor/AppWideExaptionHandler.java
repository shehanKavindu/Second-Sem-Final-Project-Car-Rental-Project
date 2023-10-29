package lk.ijse.car.advisor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class AppWideExaptionHandler {
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({RuntimeException.class})
    public ResponseUtil handleMyExceptions(RuntimeException e) {
        System.out.println(e);
        return new ResponseUtil("Error", e.getMessage(), null);
    }

/*    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler({ConstraintViolationException.class})
    public ResponseUtil handleMyExceptions(ConstraintViolationException e) {
        return new ResponseUtil("Error", "Done", null);
    }*/

}

}
