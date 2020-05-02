package SanityTests;

import Extensions.verifications;
import Utilities.CommonOps;
import WorkFlows.apiFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class grafanaAPI extends CommonOps
{

   /* @Test(description = "Test01: Get Team From Grafana")
    @Description("Test Description: Login to Grafana and Get Team")
    public void test01_GetTeam()
    {
        verifications.text(apiFlows.getTeamProperty("teams[0].name"),"MoiseiTeam");
    }*/

    @Test(description = "Test01: Add Team and Verify")
    @Description("Test Description: Add Team to Grafana and Verify")
    public void test01_addTeamAndVerify()
    {
        apiFlows.postTeam("MoiseiTeam1", "Moisei@team1.com" );
        verifications.text(apiFlows.getTeamProperty("teams[0].name"),"MoiseiTeam1");
    }

  /*  @Test(description = "Test02: Update Team and Verify")
    @Description("Test Description: Update Team in Grafana and Verify it")
    public void test02_updateTeamAndVerify()
    {
        apiFlows.updateTeam("MyTeam", "Moisei@team1.com","4" );
        verifications.text(apiFlows.getTeamProperty("teams[0].name"),"MyTeam");
    }

    @Test(description = "Test03: Delete Team and Verify")
    @Description("Test Description: Delete Team in Grafana and Verify it")
    public void test03_deleteTeamAndVerify()
    {
        apiFlows.deleteTeam("4" );
        verifications.text(apiFlows.getTeamProperty("totalCount"),"0");
    }*/
}
