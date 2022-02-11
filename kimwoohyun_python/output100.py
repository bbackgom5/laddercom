from selenium import webdriver
driver = webdriver.Chrome('D:/kimwoohyun/chromedriver.exe')

target_url = "https://nid.naver.com/nidlogin.login"

driver.get(target_url)

driver.find_element_by_name('id').send_keys('bbackgom5')
driver.find_element_by_name('pw').send_keys('123456')
driver.find_element_by_class_name('btn_global').click()

