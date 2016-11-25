<%@ page contentType="application/json; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

[
<c:forEach var="food" items="${list}" varStatus="status">
   {
      "image" : "${food.image}",   
      "imageLarge" : "${food.imageLarge}",
      "foodNameTitle" : "${food.foodNameTitle}",
      "foodPriceTitle" : "${food.foodPriceTitle}",
      "foodContent" : "${food.foodContent}"
   }   
   <c:if test="${!status.last}">,</c:if>
</c:forEach>
]