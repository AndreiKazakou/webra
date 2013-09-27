<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>webra</title>
    <meta http-equiv="Content-Type" content="text/html; charset=cp1251"/>
    <link rel="stylesheet" href="css/lab-ra.css">
    <link rel="stylesheet" href="css/menu.css">

</head>
<body>

<header>
<form id="idLoginForm" name="loginForm" method="post">
	<input type="text" maxlength="25" name="inputLogin" placeholder="Name"/>
	<input type="password" maxlength="25" name="inputPassword" placeholder="Password"/>
	<input type="submit" value="LogIn"/>
</form>
</header>
<!------------------MAIN-------------------->
<div id="main">

    <div id="left_part">
        <!------------------MENU-------------------->
        <div id="menu">
            <div id="none_up"></div>
            <div id="block_menu">
                <ul id="ul_1">

                    <li>
                        <ul>
                            <li>
                                <div onclick="this.style.marginLeft='-200px';">
                                    <a href="http://seasonvar.ru/">
                                        <div id="text1" onclick="this.style.boxShadow='0px 0px 500px white';"><span
                                                id="span1">ГЛАВНАЯ</span></div>
                                    </a>
                                </div>

                            </li>
                        </ul>
                    </li>


                    <li>
                        <ul>
                            <li>
                                <div onclick="this.style.marginLeft='-200px';">
                                    <a href="#">
                                        <div id="text2" onclick="this.style.boxShadow='0px 0px 500px white';"><span
                                                id="span2">О НАС</span></div>
                                    </a>
                                </div>
                            </li>
                        </ul>
                    </li>

                    <li>
                        <ul>
                            <li>
                                <div onclick="this.style.marginLeft='-200px';">
                                    <a href="#">
                                        <div id="text3" onclick="this.style.boxShadow='0px 0px 500px white';"><span
                                                id="span3">ПОРТФОЛИО</span></div>
                                    </a>
                                </div>

                            </li>
                        </ul>
                    </li>

                    <li>
                        <ul>
                            <li>
                                <div onclick="this.style.marginLeft='-200px';">
                                    <a href="#">
                                        <div id="text4" onclick="this.style.boxShadow='0px 0px 500px white';"><span
                                                id="span4">КОНТАКТЫ</span></div>
                                    </a>
                                </div>

                            </li>
                        </ul>
                    </li>

                </ul>
            </div>
        </div>
        <!------------------Content-------------------->
        <div id="content">
            <div id="none_up2"></div>
            Content
        </div>
    </div>
    <!------------------Advertisement-------------------->
    <div id="ad">
        <div id="none_up1"></div>
        Advertisement
    </div>
</div>

<footer>Footer</footer>


</body>
</html>
