package org.wfp.fittest.utility;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class HttpUtility {
	public static ResponseEntity<String> deleteResponse(Boolean check) {
		if (check) {
			return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
		}
		else {
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
	}
}
