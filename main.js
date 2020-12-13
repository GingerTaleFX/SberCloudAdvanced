$(document).ready(function(){
 
    var fadeInTime = 600;
    var fadeOutTime = 600; 
    var HistoryWindow = $('#history');
    var RulesWindow = $('#rules');
    var RegisterWindow = $('#register');
    var BuildingBlock = $('#building');
    var MoonIcon = $('#moon_visible');
    
  
    function fadein(el) {
      $(el).fadeIn(fadeInTime);
    }
    function fadeout(el) {
      $(el).fadeOut(fadeOutTime);
    }
    fadein(BuildingBlock);
    fadein(MoonIcon);
    fadein("#toggle");
    fadein('.tree_block');
    fadein('#simba-block');
    fadein('#dog-block');
    fadein('#boy-block');
    // fadeout('.btn_start_block');
    // $('#popup-trigger').on('click touchend', function(){
    //   // fadein(popupWindow);
    //   fadein(BuildingBlock);
    //   fadein(MoonIcon);
    //   fadein("#toggle");
    //   fadein('.tree_block');
    //   fadeout('.btn_start_block');
    //   $('.btn_start_block').remove();
    // })

    $('#history_trigger').on('click touched', function(){
        fadein(HistoryWindow);
    })

    $('#rules_trigger').on('click touched', function(){
        fadein(RulesWindow);
    })
    $('#reg_trigger').on('click touched', function(){
        fadein(RegisterWindow);
    })

    $('#user_trigger').on('click touched', function() {
      fadein('#user-window');
    });

    $('#palette_trigger').on('click touched', function(){
      fadein('#palette_position');
    })

    $('.popup-close_history').on('click touchend', function() {
      fadeout(HistoryWindow);
    });

    $('.popup-close_rules').on('click touchend', function() {
        fadeout(RulesWindow);
      });

    $('#register_close').on('click touched', function() {
      fadeout(RegisterWindow);
    });
    $('#user_close').on('click touched', function(){
      fadeout('#user-window');
    });
    $('#palette_close').on('click touched', function(){
      fadeout('#palette_position');
    })
   
    $(document).on('keyup', function(e) {
        if (e.keyCode == 27) { // (escape key)
        fadeout(HistoryWindow);
        fadeout(RulesWindow);
        fadeout(RegisterWindow);
        }
    });
  
  })

  // MENU ACTIONS

  var theToggle = document.getElementById('toggle');
// hasClass
function hasClass(elem, className) {
	return new RegExp(' ' + className + ' ').test(' ' + elem.className + ' ');
}
// addClass
function addClass(elem, className) {
    if (!hasClass(elem, className)) {
    	elem.className += ' ' + className;
    }
}
// removeClass
function removeClass(elem, className) {
	var newClass = ' ' + elem.className.replace( /[\t\r\n]/g, ' ') + ' ';
	if (hasClass(elem, className)) {
        while (newClass.indexOf(' ' + className + ' ') >= 0 ) {
            newClass = newClass.replace(' ' + className + ' ', ' ');
        }
        elem.className = newClass.replace(/^\s+|\s+$/g, '');
    }
}
// toggleClass
function toggleClass(elem, className) {
	var newClass = ' ' + elem.className.replace( /[\t\r\n]/g, " " ) + ' ';
    if (hasClass(elem, className)) {
        while (newClass.indexOf(" " + className + " ") >= 0 ) {
            newClass = newClass.replace( " " + className + " " , " " );
        }
        elem.className = newClass.replace(/^\s+|\s+$/g, '');
    } else {
        elem.className += ' ' + className;
    }
}

theToggle.onclick = function() {
   toggleClass(this, 'on');
   return false;
}

// REGISTER FORM

$('.message a').click(function(){
  $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
});