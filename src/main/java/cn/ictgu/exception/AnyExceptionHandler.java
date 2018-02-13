package cn.ictgu.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 统一异常处理
 */
@ControllerAdvice
public class AnyExceptionHandler {
    Logger logger = LoggerFactory.getLogger(AnyException.class);

    /**
     * 处理全局异常
     */
    @ExceptionHandler(Exception.class)
    public String handlerGlobalException(Exception exception, Model model) {
        logger.error(exception.getMessage(), exception);
        model.addAttribute("message", exception.getMessage());
        return "error";
    }

}
