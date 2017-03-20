function showErrorMessage(msg){
	var $errorDivContainer = $('#error-msg-java');
	var $errorDiv = $('<div/>', {
		'class':         'alert alert-danger',
		'role':          'alert',
	} );
	
	$errorDiv.html(msg);
	$errorDiv.appendTo($errorDivContainer);
	
//	var $button = $('<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span></button>');
//	$button.appendTo($errorDiv);
	
	scrollToElement($("#error-msg-java"));
}
function clearErrorMessage(){
	$('#error-msg-java').empty();
}

function scrollToElement($element){
    $('html, body').animate({
        scrollTop: $element.offset().top -$('.main-header').outerHeight() - $('.content-header').outerHeight() -10
    }, 200);
}

function doSubmit(obj, action){
	var form = $(obj).parents('form:first');
	form.attr('action' ,action)  ;
	form.submit();
}
function doPost(action){
	var form = $('<form/>', 
			{	
				action: action,
				method: 'post'
			}
		);
	
	$('body').append(form);
	form.submit();
}

function doGet(action){
	var form = $('<form/>', 
			{	
				action: action,
				method: 'get'
			}
		);
	
	$('body').append(form);
	form.submit();
}

function doRedirect(pageId){
	var $form = $('<form/>', 
			{	
				action: '/redirect',
				method: 'post'
			}
	);
	$form.append(
    		$('<input/>', 
    			{
    				type: 'hidden', 
    				name: 'pageId', 
    				value: pageId
    			}
    		)
    );
	$('body').append($form);
	$form.submit();		
}

function guid(){
	return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {
	    var r = Math.random()*16|0, v = c == 'x' ? r : (r&0x3|0x8);
	    return v.toString(16);
	});
}

jQuery(function($) { $.extend({
    form: function(url, data, method) {
        if (method == null) method = 'POST';
        if (data == null) data = {};

        var form = $('<form>').attr({
            method: method,
            action: url
         }).css({
            display: 'none'
         });

        var addData = function(name, data) {
            if ($.isArray(data)) {
                for (var i = 0; i < data.length; i++) {
                    var value = data[i];
                    addData(name + '[]', value);
                }
            } else if (typeof data === 'object') {
                for (var key in data) {
                    if (data.hasOwnProperty(key)) {
                        addData(name + '[' + key + ']', data[key]);
                    }
                }
            } else if (data != null) {
                form.append($('<input>').attr({
                  type: 'hidden',
                  name: String(name),
                  value: String(data)
                }));
            }
        };

        for (var key in data) {
            if (data.hasOwnProperty(key)) {
                addData(key, data[key]);
            }
        }

        return form.appendTo('body');
    }
}); });

$(document).ready(function() {
	if(!window.name){
		window.name = guid();
	}
//	if (self == top) {
//		document.documentElement.style.display = 'block';
//	} else {
//		top.location = self.location;
//	} 
});
