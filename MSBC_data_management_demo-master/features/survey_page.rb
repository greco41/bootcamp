class SurveyPage
  include PageObject
  page_url 'http://localhost:4567'

  text_field(:name, :id => 'name')
  text_field(:company, :id => 'company')
  text_field(:address, :id => 'address')
  text_field(:city, :id => 'city')
  text_field(:state, :id => 'state')
  text_field(:phone, :id => 'phone')
  text_field(:fav_beverage, :id => 'fav_beverage')
  text_field(:fav_phrase, :id => 'fav_phrase')
end