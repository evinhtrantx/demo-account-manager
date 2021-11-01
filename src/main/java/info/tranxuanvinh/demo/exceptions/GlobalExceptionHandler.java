/**
 * 
 */
package info.tranxuanvinh.demo.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author vinht
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler({RuntimeException.class})
	protected ResponseEntity<Map<String,Object>> translateExceptionToResponse(RuntimeException ex, WebRequest request){
		Map<String,Object> res = new HashMap<>();
		res.put("msg", "an error has occurred");
		return ResponseEntity.ok(res);
	}
}
