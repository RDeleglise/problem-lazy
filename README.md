# problem-lazy

Test postman:
localhost:8080/orders/list

Le premier test retourne un order items à null (Logique dans le ORder model, on est en lazy).

Je voudrais garder cette config lazy, mais forcer la récup des orders item via quelconque code dans le controlleur. (En gros je veux pouvoir les charger à la demande).
