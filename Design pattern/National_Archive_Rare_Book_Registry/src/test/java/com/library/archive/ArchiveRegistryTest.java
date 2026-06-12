package com.library.archive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.library.archive.config.ArchiveSecurityManager;
import com.library.archive.factory.*;
import com.library.archive.model.*;
import com.library.archive.decorator.*;

public class ArchiveRegistryTest {

    // Singleton Pattern Test
    @Test
    void testSingleton() {

        ArchiveSecurityManager manager1 =
                ArchiveSecurityManager.getInstance();

        ArchiveSecurityManager manager2 =
                ArchiveSecurityManager.getInstance();

        assertSame(manager1, manager2);

        assertEquals(
                "LEVEL-4-RESTRICTED",
                manager1.getSecurityClearanceLevel()
        );
    }

    // Simple Factory Pattern Test
    @Test
    void testArchiveItemFactory() {

        ArchiveResource manuscript =
                ArchiveItemFactory.createResource(
                        "manuscript",
                        "Declaration"
                );

        ArchiveResource map =
                ArchiveItemFactory.createResource(
                        "map",
                        "Vespucci Map"
                );

        assertTrue(manuscript instanceof Manuscript);
        assertTrue(map instanceof HistoricalMap);
    }

    // Factory Method Pattern Test
    @Test
    void testResearcherFactoryMethod() {

        Researcher academic =
                new AcademicResearcherCreator()
                        .createResearcher();

        Researcher guest =
                new GuestHistorianCreator()
                        .createResearcher();

        assertEquals(
                2,
                academic.getClearanceLevel()
        );

        assertEquals(
                1,
                guest.getClearanceLevel()
        );
    }

    // Abstract Factory Pattern Test
    @Test
    void testAbstractFactory() {

        PreservationKitFactory factory =
                new PaperRestorationKitFactory();

        assertEquals(
                "Nitrile",
                factory.createGloves()
        );

        assertEquals(
                "AcidFree",
                factory.createBufferSolution()
        );
    }

    // Builder Pattern Test
    @Test
    void testBuilder() {

        AccessPermit permit =
                new AccessPermit.Builder()
                        .researcherId("RES99")
                        .resourceId("MAP77")
                        .roomNumber(101)
                        .build();

        assertEquals(
                "RES99",
                permit.getResearcherId()
        );

        assertEquals(
                "MAP77",
                permit.getResourceId()
        );

        assertEquals(
                101,
                permit.getRoomNumber()
        );
    }

    // Decorator Pattern Test
    @Test
    void testDecorator() {

        InspectionCost inspection =
                new InsuranceCoverDecorator(
                        new BaseInspection()
                );

        assertEquals(
                60.0,
                inspection.getCost()
        );
    }
}