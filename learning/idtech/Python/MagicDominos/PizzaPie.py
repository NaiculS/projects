from customer import *
from order import *
from store import *
from payment import *
from track import *

username = input("What's your username? ")
password = input("Whats your password? ")

if username == "Trump" and password == "Tower":
    customer = Customer('Donald', 'Trump', 'donald@whitehouse.gov', '2024561111',
                        '700 Pennsylvania Avenue NW, Washington, DC, 20408')
    my_local_dominos = StoreLocator.find_closest_store_to_customer(customer)
    menu = my_local_dominos.get_menu()
    order = Order.begin_customer_order(customer, my_local_dominos)
    order.add_item('P10IRECZ')  # add a 10-inch wisconsin 6 cheese pizza
    order.add_item('B2PCLAVA')  # Chocolate Lava Crunch Cakes
    order.add_item('20BCOKE')  # and a 20oz bottle of coke
    card = CreditCard('4100123422343234', '0115', '777', '90210')
    confirmation = input("Please type CONFIRM to confirm your order of: " + str(order))
    if confirmation == "CONFIRM":
        order.place(card)
        my_local_dominos.place_order(order, card)
    else:
        print("Your order was canceled.")
else:
    print("Your username or password was incorrect.")
