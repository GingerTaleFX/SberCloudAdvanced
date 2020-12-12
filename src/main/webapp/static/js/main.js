$(document).ready(function(){
 
    var fadeInTime = 600;
    var fadeOutTime = 600; 
    var popupWindow = $('#user-window');
    var HistoryWindow = $('#history');
    var RulesWindow = $('#rules');
    var BuildingBlock = $('#building');
    var MoonIcon = $('#moon_visible');
  
    function fadein(el) {
      $(el).fadeIn(fadeInTime);
    }
    function fadeout(el) {
      $(el).fadeOut(fadeOutTime);
    }
   
    $('#popup-trigger').on('click touchend', function(){
      fadein(popupWindow);
      fadein(BuildingBlock);
      fadein(MoonIcon);
      fadein('.tree_block');
      fadeout('.btn_start_block');
      $('.btn_start_block').remove();
    })

    $('#history_trigger').on('click touched', function(){
        fadein(HistoryWindow);
    })

    $('#rules_trigger').on('click touched', function(){
        fadein(RulesWindow);
    })

    $('.popup-close_history').on('click touchend', function() {
      fadeout(HistoryWindow);
    });

    $('.popup-close_rules').on('click touchend', function() {
        fadeout(RulesWindow);
      });
   
    $(document).on('keyup', function(e) {
        if (e.keyCode == 27) { // (escape key)
        fadeout(HistoryWindow);
        fadeout(RulesWindow);
        }
    });
  
  })