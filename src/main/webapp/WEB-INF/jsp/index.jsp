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
                <div class="big-pixel-art--house" id="building"></div>
            </div>
            <div class="tree_block">
                <div class="forest-pixel-art--forest forest" id="tree1"></div>
            </div>
            <div class="tree_block">
                <div class="forest-pixel-art--forest forest"></div>
            </div>
            <div class="tree_block">
                <div class="forest-pixel-art--forest forest"></div>
            </div>
            <!-- MENU BLOCK -->
            <a href="#menu" id="toggle"><span></span></a>
            <div id="menu">
                <ul>
                <li><a href="#History" id="history_trigger">History</a></li>
                <li><a href="#Rules" id="rules_trigger">Rules</a></li>
                <li><a href="#create_account" id="reg_trigger"> Create account</a></li>
                <li><a href="#addU"> Add University</a></li>
                <li><a href="#AddGF"> Add Google Fit</a></li>
                <li><a href="#userCard" id="user_trigger"> User Card</a></li>
                <li><a href="#palette" id="palette_trigger"> Palette</a></li>
                </ul>
            </div>
            <canvas></canvas>
            <!-- /MENU BLOCK -->
            <!-- USER CARD BLOCK -->
            <div id="user-window">
                 <c:if test="${user != null}">
                    <span id="user_close" >&times;</span>
                    <div class="card-container">
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
                        <audio controls  loop autoplay>
                            <source src="<c:url value="static/music/change.mp3"/>" type="audio/ogg">
                            Your browser dose not Support the audio Tag
                        </audio>
                    </div>
                </c:if>
            </div>
            <!-- /USER CARD BLOCK -->

        </div>
            <div class="pixel-art--moon moon" id="moon_visible"></div>
            <div class="land"></div>
        </div>
        <!-- POP UP'S -->
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
            <div class="popup-close_rules"> &times;
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
        <div class="register" id="register">
            <div class="form">
                <span id="register_close" >&times;</span>
                <form class="register-form">
                    <input type="text" placeholder="name"/>
                    <input type="password" placeholder="password"/>
                    <input type="text" placeholder="email address"/>
                    <button>create</button>
                    <p class="message">Already registered? <a href="#">Sign In</a></p>
                </form>
                <form class="login-form">
                    <input type="text" placeholder="username"/>
                    <input type="password" placeholder="password"/>
                    <button>login</button>
                    <p class="message">Not registered? <a href="#">Create an account</a></p>
                </form>
            </div>
        </div>
        <div id="palette_position">
            <span id="palette_close" >&times;</span>
            <div class="palette" id="palette"></div>
            <div class="palette_menu">
                <ul>
                <li><a href="#" class="clear warn">Clear</a></li>
                <li><a href="#" class="save">Save</a></li>
                <li><a href="#" class="paint" id="paint_trigger">Paint</a></li>
                <li><a href="colored.html" class="colored_v">Colored</a></li>
                </ul>
            </div>
        </div>
        <!-- /POP UP'S  -->
<%@ include file = "footer.jsp" %>
</body>
</html>