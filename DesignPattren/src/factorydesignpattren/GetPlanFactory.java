package factorydesignpattren;

public class GetPlanFactory {
public Plan getPlan(String planType)
{
	if(planType == null)
	{
		return null;
	}
	if(planType.equalsIgnoreCase("DOMASTICPLAN"))
	{
		return new DomasticPlan();
	}
	else if(planType.equalsIgnoreCase("COMMERCIALPLAN"))
	{
		return new CommercialPlan();
	}
	return null;
	}
}
