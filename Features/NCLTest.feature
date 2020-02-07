Feature: NCL shore excursions for Alaska Cruises 

@Test
Scenario: Guest explores shore excursions destinations

Given a Guest
And I am on Homepage
And I navigated to "Shore Excursion" page
When I search for destination "Alaska Cruises"
Then Shore Excursions page is present
And Results are filtered by "Alaska Cruises"
And Filter By Ports are only belong to "Alaska, British Columbia"


#To execute this test please change the driver path 

#I have setup the driver with in the project but that works for Mac Machine if are you using windows Machine change the driver file to  .exe 

# just i have written the basic test case we can add more assertions and build the page facorty in diffrent way also.

# And we can add best reports in cucumber (like trivago cluecumber report and vimalselvan reports) easily figure it out the exceptions 

# i have better ideas to develop the framework but the lack of time haven't implemented everything 

# for the data we can drive from Excel and properties files

# we can add custom waits to the handle the synchronization issues.







