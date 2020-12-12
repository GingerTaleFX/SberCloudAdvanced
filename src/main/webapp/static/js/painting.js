const STATE = {
    mode: "structure",
    gridX: 0,
    gridY: 0,
    current: "",
    colors: [
      "#6B8E23",
      "#9ACD32",
      "#2E8B57",
      "#228B22",
      "#32CD32",
      "#7CFC00",
      "#BDB76B",
      "#F0E68C",
      "#CD853F",
      "#DAA520",
      "#191970",
      "#4169E1",
      "#1E90FF",
      "#B0C4DE",
      "#696969",
      "#A9A9A9",
      "#D3D3D3"
    ]
  };

  const PALETTE = document.querySelector(".palette");
  const SAVE_BTN = document.querySelector(".save");
  const CWIDTH = 600;
  const CHEIGHT = 600;

  createUI();

  function createUI() {
    STATE.colors.forEach(e => {
      createElement({
        parent: PALETTE,
        tag: "div",
        classes: "col",
        addToParent: true,
        style: e,
        hex: e
      });
    });
  }

  function createElement({
    parent,
    tag,
    content,
    classes,
    addToParent,
    style,
    hex
  } = {}) {
    let el = document.createElement(tag);
    if (content) {
      let txt = document.createTextNode(content);
      el.appendChild(txt);
    }
    if (classes) {
      el.setAttribute("class", classes);
    }
    if (style) {
      el.setAttribute("style", `background-color:${style}`);
    }
    if (hex) {
      el.dataset.hex = hex;
    }
    if (addToParent) {
      parent.appendChild(el);
    }
    return el;
  }


  // paint tree
  var theToggle = document.querySelector('#tree1');

  function hasClass(elem, className) {
    return new RegExp(' ' + className + ' ').test(' ' + elem.className + ' ');
  }
  function addClass(elem, className) {
      if (!hasClass(elem, className)) {
        elem.className += ' ' + className;
      }
  }
  function trigClass(elem, className) {
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
$('#paint_trigger').on('click touched', function(){
  addClass(theToggle);
  trigClass(theToggle, 'colored-forest-pixel-art--forest forest');
  return false;
});