from customer import *
from store import *

print("Hi")
customer = Customer('Lucian', 'Pugh', 'naicul@me.com', '9176029117',
                    '425 6th Avenue, New York, New York, 10011')
print("hi")
my_local_dominos = StoreLocator.find_closest_store_to_customer(customer)
print("Hi")
menu = my_local_dominos.get_menu()
print("hi")
menu.search(Name='Chocolate')
