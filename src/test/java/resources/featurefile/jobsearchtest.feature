@regression
Feature: Job Search Test
  As a user of the website i want to be able to search for jobs using the search fields

  @smoke
  Scenario Outline: User is able to enter text and select from dropdown fields on the search homepage
    Given I am on homepage
    When I click on the accept cookies button
    And I can enter the job title in job title field "<jobTitle>"
    And i can enter the location in location field "<location>"
    And i can enter the distance in the distance field "<distance>"
    And i can click on the more search options button
    And i can enter min salary in the min salary field "<minSalary>"
    And i can enter max salary in the max salary field "<maxSalary>"
    And i can select the type of salary in the salary type field "<salaryType>"
    And i can select the type of job term in the job type field "<jobType>"
    Then i can click on the find jobs button
    Examples:
      | jobTitle            | location   | distance        | minSalary | maxSalary | salaryType | jobType        |
      | Software Engineer   | London     | up to 35 miles  | 50000     | 100000    | Per annum  | Apprenticeship |
      | Test Engineer       | Manchester | up to 10 miles  | 30000     | 80000     | Per month  | Part Time      |
      | Product Manager     | Birmingham | up to 500 miles | 60000     | 120000    | Per month  | Contract       |
      | DevOps Engineer     | Liverpool  | up to 750 miles | 70000     | 150000    | Per day    | Temporary      |
      | Data Scientist      | Newcastle  | up to 50 miles  | 80000     | 180000    | Per hour   | Permanent      |
      | Front End Developer | Bristol    | up to 25 miles  | 40000     | 90000     | Per hour   | Permanent      |