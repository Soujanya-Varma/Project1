package Project;

public class Description extends Products{
	
	String desc[][] = {
			
			// Laptops
			{ "Dell\ni5\n10th gen\n8 GB RAM\nRs. 47000", "HP\ni5\n10th gen\n8 GB RAM\nRs. 45000", "Lenovo\ni5\n10th gen\n8 GB RAM\nRs. 39000", "Acer\ni7\n11th gen\n8 GB RAM\nRs. 59000", "Asus\ni7\n12th gen\n16 GB RAM\nRs. 67000" },

			// Mobiles
			{ "Vivo\n6 GB RAM\n5000mAh Battery\nRs. 24000", "Oppo\n6 GB RAM\n6000mAh Battery\nRs. 27000", "Samsung\n4 GB RAM\n5000mAh Battery\nRs. 17000", "Realme\n6 GB RAM\n5000mAh Battery\nRs. 19000", "OnePlus\n8 GB RAM\n8000mAh Battery\nRs. 40000" },

			// Wearables
			{ "Fire Boltt\nBlack\nCircle\nVoice Control\nRs. 10000", "Noise\nBrown\nSquare\nCall Function\nRs. 12000", "Boat\nWhite\nRectangle\nCall Function\nRs. 13000", "Fastrack\nBlack\nSquare\nVoice Control\nRs. 11000", "Fossil\nGreen\nRound\nInbuilt Games\n14000" },

			// TV's
			{ "LG\nLED\n55 inches\nRs. 49000", "Samsung\nHD\n45 inches\nRs.37000", "Sony\nLED\n45 inches\nRs. 52000", "TCL\nLED\n42 inches\nRs. 45000", "Acer\nUltra HD\n57 inches\nRs. 59000" },

			// Men
			{ "Ethnic Wear\nBlue\nXL\nRs. 1800", "Casuals\nBlack\nXXL\nRs. 1500", "Formals\nWhite\nXL\nRs. 2500", "Sports Wear\nRed\nXXL\nRs. 1100", "Party Wear\nBlack\nXXL\nRs. 2100" },

			// Women
			{ "Ethnic Wear\nBlue\nXL\nRs. 1600", "Casuals\nBlack\nXXL\nRs. 1700", "Formals\nWhite\nXL\nRs. 1400", "Sports Wear\nRed\nXXL\nRs. 1000", "Party Wear\nBlack\nXXL\nRs. 1900" },

			// Kids
			{ "Ethnic Wear\nBlue\nL\nRs. 1000", "Casuals\nBlack\nL\nRs. 800", "Formals\nWhite\nM\nRs. 900", "Sports Wear\nRed\nL\nRs. 700", "Party Wear\nBlack\nM\nRs. 1200" },

			// Watches
			{ "Titan\nBrown\nRound\nRs. 5000", "Fastrack\nBlack\nRound\nRs. 8000", "Diesel\nWhite\nSquare\nRs. 6000", "Fossil\nBlack\nRound\nRs. 4000", "Sonata\nBrown\nRectangle\nRs. 9000" },

			// Snacks
			{ "Biscuites\nCookies\n500g\nRs. 900", "Chips\nChilli Sprinkled\n400g\nRs. 100", "Sweets\nMTR\n500g\nRs. 1100", "Chocolates\nCadbury\n130g\nRs. 1100", "Pickles\nSpicy\n250g\nRs. 450" },

			// Household Care
			{ "Air Fresheners\nOdonol\n400g\nRs. 110", "Glass Cleaner\nColin\n100ml\nRs. 500", "Storage Containers\nMaster Cook\n3 Boxes\nRs. 700", "Floor Cleaner\nLizol\n650ml\nRs. 950", "Laundry Essentials\nAriel\n500g\nRs. 1000" },

			// Skin Care
			{ "Face Wash\nPonds\n200g\nRs. 1100", "Creams\nNivea\n100ml\nRs. 1000", "Lotions\nNivea\n400ml\nRs. 2500", "Soaps\nDettol\n800g\nRs. 1400", "Talcs\nPonds\n400g\nRs. 1000" },

			// Beverages
			{ "Soft Drinks\nThums Up\n6000ml\nRs. 1500", "Health Drinks\nBoost\n700g\nRs. 800", "Coffee\nBru\n200g\nRs. 150", "Tea\nTaj Mahal\n200g\nRs. 180", "Energy Drinks\nGlucon-D\n800g\nRs. 850" },

			// Sofa
			{ "Nilkamal\nBrown\n6 Seater Sofa\nRs. 32000", "Durian\nBlack\n3 Seater Sofa\nRs. 18000", "Furny\nGrey\n5 Seater Sofa\nRs. 16000", " Wooden Street\nBrown\n3 Seater Sofa\nRs. 10000", "Vittoria\nBlack\n6 Seater Sofa\nRs. 35000" },

			// Table
			{ "Wood Buzz\nBrown\n1 pcs\nRs. 2000", "Furinno\nWhite\n1 pcs\nRs. 1700", "Bluewud\nBlack\n5 pcs\nRs. 1350", "Feather Lite\nBrown\n3 pcs\nRs. 1500", "Space wood\nGrey\n3 pcs\nRs. 1100" },

			// Bed
			{ "Wakefit\nWhite\n1 pcs\nRs. 15000", "Furniture Kart\nBlack\n1 pcs\nRs. 19000", "Nilkamal\nBrown\n1 pcs\nRs. 25000", "Sleep Well\nGrey\n1 pcs\nRs. 22000", "Kurlon\nBrown\n1 pcs\nRs. 27000" },

			// Wardrobe
			{ "Space Wood\nBrown\n2 pcs\nRs. 1400", "Cello\nBrown\n1 pcs\nRs. 1200", "Trevi\nBlue\n1 pcs\nRs. 1000", "Clixfurn\nBrown\n1 pcs\nRs. 1300", "Star Wood\nBrown\n1 pcs\nRs. 1800" },

			// Fiction
			{ "Doraemon\n20 Available\n5 main characters\nRs. 700", "Avatar the Last Airbender\n17 Available\n3 main characters\nRs. 750", "American Dragon\n13 Available\n4 main characters\nRs. 530", "Phineas and Ferb\n14 Available\n3 main characters\nRs. 280", "Super Robot Monkey Team Hyper Force Go\n9 Available\n7 main characters\nRs. 600" },

			// Health and Fitness
			{ "Hacking Health\n5 Available\nRs. 1000", "Fitness Habits\n7 Available\nRs. 1300", "Food Guide\n10 Available\nRs. 1500", "The Fitness Mindset\n9 Available\nRs. 1600", "Why We Sleep\n3 Available\nRs. 1100" },

			// Children
			{ "Little Singham\n3 main Characters\n15 Available  \nRs. 730", "Shinchan\n9 main Characters\n5 Available\nRs. 640", "Jackie Chan Adventures\n3 main Characters\n10 Available\nRs. 910", "Ben 10\n3 main Characters\n30 Available\nRs. 690", "Dragon Booster\n5 main Characters\n15 Available\nRs. 490" },

			// Education
			{ "Artificial Intelligence\nCS\n10 available\nRs. 1200", "Networking\nCS\n15 Available\nRs. 1250", "Operating Systems\nCS\n20 Available\nRs. 1300", "Data Analytics\nCS\n2 Available\nRs. 1300", "Software Design\nCS\n11 Available\nRs. 1500" }, };
}
