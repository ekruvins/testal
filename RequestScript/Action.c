Action()
{	
	char *request_json_text;
	char *request_json;
	
	web_add_header("Content-Type", "application/json; charset=utf-8");
	request_json_text="{\"client\":\"{client}\",\"summ\":{summ}}";
	lr_save_string(lr_eval_string(request_json_text),"request_json");
	
	lr_start_transaction("request");
		web_custom_request("web_custom_request",
		    "URL={host}:{port}/servlet-test/Stub_json",
		    "Method=POST",
		    "TargetFrame=",
		    "RecContentType=text/html",
		    "EncType=application/json",
		    "Resource=0",
		    "Referer=",
		    "Mode=HTTP",
		    "Body={request_json}",
		     LAST); 
	lr_end_transaction("request",LR_AUTO);
	return 0;

}
