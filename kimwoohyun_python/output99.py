from selenium import webdriver
driver = webdriver.Chrome('D:kimwoohyun/chromedriver.exe')

target_url = "https://www.naver.com/"

driver.get(target_url)

search_box = driver.find_element_by_name('query')

search_box.send_keys('Python')

search_box.submit()
