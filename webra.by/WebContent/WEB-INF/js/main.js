window.addEventListener("load", resizeFont);
window.addEventListener("resize", resizeFont);

function resizeFont() {
    if (document.body.clientWidth > document.body.clientHeight) {
        document.body.style.fontSize = document.body.clientHeight * 0.025 + "px";

    }
    else {
        document.body.style.fontSize = document.body.clientWidth * 0.015 + "px";
    }
}




