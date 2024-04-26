<style>
body {background-color: LightCyan;}
a   {color: red;}
</style>


<header>
	<nav class="navbar navbar-expand-md navbar-dark"
		style="background-color: mediumorchid">
		<div>
			<a href="https://www.javaguides.net" class="navbar-brand"> TodoSL App</a>
		</div>

		<ul class="navbar-nav navbar-collapse justify-content-end">
			<li><a href="<%= request.getContextPath() %>/login" class="nav-link">Login</a></li>
			<li><a href="<%= request.getContextPath() %>/register" class="nav-link">Signup</a></li>
		</ul>
	</nav>
</header>