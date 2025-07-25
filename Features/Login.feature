Feature: Login feature for orangeHRM site

	@Login
	Scenario Outline: Login with different users
		Given User lands in url "https://www.way2automation.com/way2auto_jquery/index.php"
		When User provides name "<name>"
		And User provides phone "<phone>"
		And User provides email "<email>"
		And User provides country "<country>"
		And User provides city "<city>"
		And User provides username "<username>"
		And User provides password "<password>"
		And user clicks on login button
		Then user should see success message of "This is just a dummy form, you just clicked SUBMIT BUTTON"
	
		Examples: 
			| name | phone | email | country | city | username | password |
    		| vgvgvg | 9134578977 | vghvgh@gmail.com | India | chennai | vgvghh | jbjhhggh |
    		| vgvgvh | 9134578978 | vghvgj@gmail.com | Iceland | Iceland | vgvghj | jbjhhggk |