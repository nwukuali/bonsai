<#macro kradappheader element>

<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <div class="nav-collapse collapse">
                <ul class="nav">
                    <li class="active"><a href="dashboard?viewId=DashboardView&methodToCall=start">Home</a></li>
                    <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Administration <b
                            class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="holidayMaintenance?viewTypeName=MAINTENANCE&methodToCall=maintenanceEdit&dataObjectClassName=za.ac.nwu.bonsai.form.HolidayMaintenanceForm&viewName=HolidayManagementView">Public Holidays</a></li>
                        </ul>
                    </li>
                </ul>
                <ul class="nav pull-right">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-user icon-white"></i>
                        ${UserSession.loggedInUserPrincipalName!"You are not logged in."}
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="${ConfigProperties['application.url']}/logout.do">Logout</a>
                            </li>
                        </ul>
                    </li>
                </ul>
                <!--<form class="navbar-form pull-right"><input class="span2" type="text" placeholder="Email"> <input-->
                <!--class="span2" type="password" placeholder="Password">-->
                <!--<button type="submit" class="btn">Sign in</button>-->
                <!--</form>-->
            </div>
            <!--/.nav-collapse --></div>
    </div>
</div>

<img id="u100008" class="uif-image uif-boxLayoutVerticalItem clearfix" alt="" src="http://localhost:8080/bonsai/img/header.jpg"></img>

</#macro>
