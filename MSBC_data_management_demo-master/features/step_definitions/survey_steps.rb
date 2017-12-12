Given(/^I have a fake name$/) do
  @name = Faker::Name.name
  @company = Faker::Company.name
  @address = Faker::Address.street_address
  @city = Faker::Address.city
  @state = Faker::Address.state
  @phone = Faker::PhoneNumber.phone_number
  @fav_beverage = Faker::Beer.name
  @fav_phrase = Faker::Company.catch_phrase
end

When(/^I fill in the name$/) do
  visit SurveyPage do |page|
    page.name = @name
    page.company = @company
    page.address = @address
    page.city = @city
    page.state = @state
    page.phone = @phone
    page.fav_beverage = @fav_beverage
    page.fav_phrase = @fav_phrase
  end
end

Then(/^the name is populated$/) do
  fail 'You need to make this a good failure'
end