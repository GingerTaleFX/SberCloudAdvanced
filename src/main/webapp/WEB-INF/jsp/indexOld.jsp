<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <link rel="stylesheet" type="text/css" href="<c:url value="static/css/style.css"/>">
    <link rel="shortcut icon" href="favicon.ico?" type="image/x-icon" />
    <title>MOLD</title>
</head>
<body>
<div class="wrapper">
    <div class="sky">
        <div class="btn_start_block" >
            <button class="btn_start" id="popup-trigger">START</button>
        </div>
        <div class="building_block" id="building">
            <img src="static/pics/building.png" alt="">
        </div>
        <div id="user-window">
            <c:if test="${user != null}">
                <div class="card-container">
                    <div class="my-profile">
                        <span class="thumb"><img src="#" alt="" /></span>
                    </div>
                    <div class="info">
                        <p class="level">${user.getLevel()} Level</p>
                        <p class="name">${user.getUsername()}</p>
                        <c:if test="${user.getUniversity() != null}">
                            <p class="role">Student</p>
                            <p class="location">Aalto University, Finland</p>
                        </c:if>
                    </div>
                    <div class="energy">
                        <em>Energy</em>
                        <div><span class="html" style="width:${user.getEnergy()}"></span></div>
                    </div>
                </div>
            </c:if>
            <button class="btn_connect"><a href="#">Add studying account</a></button>
            <button class="btn_connect"><a href="#">Add Google Fit</a></button>
            <button class="btn_connect" id="history_trigger"><a href="#">History</a></button>
            <button class="btn_connect" id="rules_trigger"><a href="#">Rules</a></button>
            <embed src="./music/change.mp3" autostart="true" hidden="true" loop="true"> </embed>

        </div>
        <div class="popup_window x-close" id="history">
            <div class="popup-close_history">&times;
                <div class="history_text">
                    <p>Once upon a Time the world was filled with colors and inhabited by many amazing creatures.
                        But then people stopped appreciating what they had, especially the Time. </p>
                    <br>
                    <p>Time does not tolerate mistreatment of itself,
                        so it took animals, and plants, and the color that filled everything around.
                        It left only gray nowhere.</p>
                    <br>
                    <p>But this does not mean that all is lost. Before disappearing,
                        Time said that everything can be returned. But for this you have
                        must make overcome your old habits.</p>
                </div>
            </div>

        </div>
        <div class="popup_window x-close" id="rules">
            <div class="popup-close_rules">&times;
                <div class="rules_text">
                    <p>Rules are simple:</p>
                    <p>
                        1. You login with your University account and Google Fit account <br>
                        2. Deal with daily quests and gain energy <br>
                        3. Spend for coloring your world <br>
                        4. get higher level, open new locations, deal with your peers and mates <br>
                    </p>
                </div>
            </div>
        </div>
    </div>
    <div class="moon" id="moon_visible">

    </div>
    <div class="land"></div>
</div>
<%@ include file = "footer.jsp" %>
</body>
</html>
